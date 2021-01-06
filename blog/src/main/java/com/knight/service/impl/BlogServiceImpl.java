package com.knight.service.impl;

import com.knight.entity.Blog;
import com.knight.mapper.BlogMapper;
import com.knight.service.BlogService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author knight
 * @since 2021-01-04
 */
@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

}
